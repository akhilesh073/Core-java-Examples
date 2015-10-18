package com.akh.immutable;

import java.util.Date;

/**
 * An immutable class is one whose state can not be changed once created 1)
 * Don’t provide “setter” methods — methods that modify fields or objects
 * referred to by fields.
 * 
 * This principle says that for all mutable properties in your class, do not
 * provide setter methods. Setter methods are meant to change the state of
 * object and this is what we want to prevent here.
 * 
 * 2) Make all fields final and private
 * 
 * This is another way to increase immutability. Fields declared private will
 * not be accessible outside the class and making them final will ensure the
 * even accidentally you can not change them.
 * 
 * 3) Don’t allow subclasses to override methods
 * 
 * The simplest way to do this is to declare the class as final. Final classes
 * in java can not be overridden.
 * 
 * 4) Special attention when having mutable instance variables
 * 
 * Always remember that your instance variables will be either mutable or
 * immutable. Identify them and return new objects with copied content for all
 * mutable objects. Immutable variables can be returned safely without extra
 * effort.
 * 
 * A more sophisticated approach is to make the constructor private and
 * construct instances in factory methods.
 * 
 * Lets add all above rules and make something concrete class implementation.
 */
public final class ImmutableClassEx{
	private final Integer id;
	private final String name;
	private final Date joiningDate;

	/**
	 * @param id
	 * @param name
	 * @param joiningDate
	 */

	private ImmutableClassEx(Integer id, String name, Date joiningDate) {
		this.id = id;
		this.name = name;
		this.joiningDate = new Date(joiningDate.getTime());
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return new Date(joiningDate.getTime());
	}

	public static ImmutableClassEx newInstance(Integer id, String name,
			Date joiningDate) {
		return new ImmutableClassEx(id, name, joiningDate);
	}

	@Override
	public String toString() {
		return "ImmutableEx [id=" + id + ", name=" + name + ", joiningDate="
				+ joiningDate + "]";
	}
}
