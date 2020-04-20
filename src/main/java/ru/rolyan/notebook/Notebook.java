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
	
	//Новое задание!
	//Надо реализовать метод по поиску в контактах, контакта с заданым именем.
//Т.е. мы добавляем много контактов через метод add , а потом среди них надо найти Васю
	public Contact findByName(String name) throws RuntimeException{
		//Если передали пустое имя, или контакта нет в записной книжке, то генерим исключение
		
	}
	
	
}
