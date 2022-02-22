package com.nw.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

	private static volatile DateUtil instance;

	private DateUtil() {
		System.out.println("Constuctor called....");
	}

	public static DateUtil getObject() {
		{
			if (instance == null)
				instance = new DateUtil();
		}

		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning of this obj is not supported");
	}

	public Object readResolve() {
		return instance;
	}
}
