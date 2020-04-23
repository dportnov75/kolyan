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
}//Эта скобка закрывает класс
//И этот метод висит в воздухе
    @Test
    public void test_notebook2() {
	   Notebook notebook = new Notebook();
	   Contact vasya = new Contact("Сысой","d","s");
	   Contact vasya1 = new Contact("b","d","s");
	   notebook.addContact(vasya);
	   notebook.addContact(vasya1);
	   
	   List<Contact> contacts = notebook.getContacts();
	   //Ты добавил два контакта. Этот метод вернет false и тест не пройдет
	   Assertions.assertTrue(contacts.size() == 1);
	   //Вот пример теста
	   Assertions.assertTrue(notebook.findByName("Сысой")!= null);
}
