/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ IdolGruop
 * 
 * 1. °³¿ä : 
 * 2. ÀÛ¼ºÀÏ : 2015. 5. 28.
 * </pre> 
 * 
 * @author	: 2636 È«¼ººó
 * @version : 1.0
 */

public class IdolGruop {

	public static void main(String[] args) {
		String[] idolGroup = {"ºò¹ð", "2NE1", "°É½ºµ¥ÀÌ"};
		String[][] members = {
				{"GD", "ÅÂ¾ç", "´ë¼º", "Å¾", "½Â¸®"},
				{"CL", "»ê´Ù¶ó¹Ú", "¹Úº½", "¹ÎÁö"},
				{"À¯¶ó", "Çý¸®", "¼ÒÁø", "¹Î¾Æ"}
		};
		
		for(int i = 0; i < members.length; i++) {
			System.out.println("<< " + idolGroup[i] + " ¸â¹ö>>");
			for(int j = 0; j < members[i].length; j++) {
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
