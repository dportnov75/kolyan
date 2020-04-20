package ru.rolyan.notebook;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс описывает записную книжку телефона
 * @author dportnov
 *
 */
public class Notebook {

	//Список контактов
	private List<Contact> contacts = new LinkedList<>();
	
	/**
	 * Добавляет контакт в книгу
	 * @param contact Контакт
	 * @throws RuntimeException Контакт == null 
	 */
	public void addContact(Contact contact) throws RuntimeException {
		if (contact == null) throw new RuntimeException("неправильно добавлен контакт");
		contacts.add(contact);
	}
	

	/**
	 * Полный список всех контактов
	 * @return Список всех контактов
	 */
	public List<Contact> getContacts() {
		return contacts;
	}
	
	
	//Здесь необходимо реализовать метод для добавления новых контактов в записную книгу.
	//Класс с тестами находится в папке test -> ru.rolyan.notebook.NotebookTest
	
	
}
