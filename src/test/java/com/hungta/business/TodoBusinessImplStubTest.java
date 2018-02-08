package com.hungta.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.hungta.data.api.TodoService;
import com.hungta.data.stub.TodoServiceStub;

public class TodoBusinessImplStubTest {
	
	@Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodoRelatedToString("Hungta");
		assertEquals(2,  todos.size());
	}
}
