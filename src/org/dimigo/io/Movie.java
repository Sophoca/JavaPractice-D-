/**
 * 
 */
package org.dimigo.io;

import java.util.List;

/**
 * <pre>
 * org.dimigo.io
 *   |_ Movie
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 28.
 * </pre>
 *
 * @author		: 2636 홍성빈
 * @version		: 1.0
 */
public class Movie {
	private String title;
	private String link;
	private String image;
	private String subtitle;
	private String pubDate;
	private String director;
	private List<String> actors;
	private String userRating;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}
	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * @return the pubDate
	 */
	public String getPubDate() {
		return pubDate;
	}
	/**
	 * @param pubDate the pubDate to set
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @return the actor
	 */
	public List<String> getActors() {
		return actors;
	}
	/**
	 * @param actor the actor to set
	 */
	public void setActors(List<String> actors) {
		this.actors = actors;
	}
	/**
	 * @return the userRating
	 */
	public String getUserRating() {
		return userRating;
	}
	/**
	 * @param userRating the userRating to set
	 */
	public void setUserRating(String userRating) {
		this.userRating = userRating;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", link=" + link + ", image=" + image
				+ ", subtitle=" + subtitle + ", pubDate=" + pubDate
				+ ", director=" + director + ", actors=" + actors
				+ ", userRating=" + userRating + "]";
	}
}
