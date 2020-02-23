package com.itranswarp.world;

import java.util.*;

public class Message {
	public final int sequence;
	public final String text;

	public Message(int sequence, String text) {
		this.sequence = sequence;
		this.text = text;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Message) {
			Message m = (Message) o;
			return Objects.equals(this.text, m.text)
					&& this.sequence == m.sequence;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return sequence + text.hashCode();
	}
}
