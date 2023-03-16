package dto;

import java.util.Arrays;

public class Preferences {
	private int id;
	private boolean receiveNewsletter;
	private String[] interests;
	private String favouriteWord;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isReceiveNewsletter() {
		return receiveNewsletter;
	}

	public void setReceiveNewsletter(boolean receiveNewsletter) {
		this.receiveNewsletter = receiveNewsletter;
	}

	public String[] getInterests() {
		return interests;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	public String getFavouriteWord() {
		return favouriteWord;
	}

	public void setFavouriteWord(String favouriteWord) {
		this.favouriteWord = favouriteWord;
	}
	@Override
	public String toString() {
		return "Preferences [id=" + id + ", receiveNewsletter=" + receiveNewsletter + ", interests="
				+ Arrays.toString(interests) + ", favouriteWord=" + favouriteWord + "]";
	}

}
