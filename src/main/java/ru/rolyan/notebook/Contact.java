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

	/**
	 * метод возвращающий значение поля firstName
	 * @return возвращает значение поля firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * метод возвращающий значение поля LastName
	 * @return возвращает значение поля LastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * метод возвращающий значение поля phone
	 * @return возвращает значение поля phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 
	 * @param firstName Имя
	 * @param lastName Фамилия
	 * @param phone Номер телефона
	 * @throws RuntimeException Имя,Фамилия или Номер телефона == null
	 */
	public Contact(String firstName, String lastName, String phone) throws RuntimeException {
		super();
		if (firstName == null || lastName == null || phone == null) {
			throw new RuntimeException("не заполнено поле");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	
	//Дополнить полями контакта ( фамилия, цвет волос, размер ноги etc)
	//Необходимо сделать геттеры, конструктор, проверку на ввод недопустимых данных ( например, пустое имя)

}
