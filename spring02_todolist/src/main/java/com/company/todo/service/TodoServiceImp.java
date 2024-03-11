package com.company.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.todo.dto.TodoDTO;
import com.company.todo.repository.TodoRepository;

@Service
public class TodoServiceImp implements TodoService{
	
	@Autowired//TodoRepository타입을 자동으로 가지고 객체 생성?
	private TodoRepository todoRepository;

	@Override
	public List<TodoDTO> search() throws Exception {
		
		return todoRepository.getTodoList();
	}

	@Override
	public int insert(TodoDTO dto) throws Exception {

		return todoRepository.insertTodoList(dto) ;
	}

	@Override
	public int update(TodoDTO dto) throws Exception {
		
		return todoRepository.updateTodoList(dto);
	}

	@Override
	public int delete(int id) throws Exception {
		
		return todoRepository.deleteTodoList(id);
	}

}
