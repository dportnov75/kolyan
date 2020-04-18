package ru.rolyan.notebook;

/**
 * Контакт, который хранится в записной книге
 * @author dportnov
 *
 */
public class Contact {
	
	private String firstName;
	
	private String lastName;
	
	private String phone;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public Contact(String firstName, String lastName, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	public void proverochka () {
		if (firstName == null || lastName == null || phone == null) {
			throw new RuntimeException("не заполнено поле");
		}
	}
	
	//Дополнить полями контакта ( фамилия, цвет волос, размер ноги etc)
	//Необходимо сделать геттеры, конструктор, проверку на ввод недопустимых данных ( например, пустое имя)

}
