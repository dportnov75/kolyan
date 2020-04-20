package ru.rolyan.notebook;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotebookTest {

	
	@Test
	public void test_notebook() {
		Notebook notebook = new Notebook();
		List<Contact> contacts = notebook.getContacts();
		Assertions.assertTrue(contacts.size() == 0);
		//Эти две строки эквивалентные. 
		Assertions.assertTrue(notebook.getContacts().size() == 0);
	}
	@Test
	public void test_notebook1() {
		Notebook notebook = new Notebook();
		Contact contact = new Contact("a","d","s");
		notebook.addContact(contact);
		List<Contact> contacts = notebook.getContacts();
		Assertions.assertTrue(contacts.size() == 1);
	}
}
