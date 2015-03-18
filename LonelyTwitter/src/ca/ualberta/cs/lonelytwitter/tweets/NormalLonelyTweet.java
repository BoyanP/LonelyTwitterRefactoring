package ca.ualberta.cs.lonelytwitter.tweets;

import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends 
LonelyTweet implements Serializable {

	private String thisisntEvenMyFinalStringForm;

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public String toString() {
		setThisisntEvenMyFinalStringForm(getTweetDate() + " | " + getTweetBody());
		return getThisisntEvenMyFinalStringForm();
	}

	public String getTweetBody()
	{
		return tweetBody;
	}

	private String getThisisntEvenMyFinalStringForm()
	{

		return thisisntEvenMyFinalStringForm;
	}

	private void setThisisntEvenMyFinalStringForm(
			String thisisntEvenMyFinalStringForm)
	{

		this.thisisntEvenMyFinalStringForm = thisisntEvenMyFinalStringForm;
	}
}
