package test3;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("ETIA. - On And On!! feat. Jenga (G2R2018 Mix)");
		hs.add("eicateve - R.I.P. [#G2R2018]");
		hs.add("Sakuzyo - 【G2R2018】Destr0yer (feat. Nikki Simmons)");
		hs.add("EBIMAYO - 【#G2R2018】EBIMAYO - GOODWORLD (Exntended)");
		hs.add("Micelle - [#BOFXVII]俗物フェスティバル");
		hs.add("立秋／rissyuu - 【BOF:ET】😲🙌👾🤖🤸👺🌠🤲👻🖐️🛸😀 ／ 立秋feat.ちょこ");
		hs.add("litmus* / Ester - Bliss (Original Mix)");
		hs.add("わかどり / *wakadori - 【BOFXVI】NightTheater");
		hs.add("EBIMAYO - 【#BOFXVI】BLACKTIGER - BADSECRET (Extended)");
		hs.add("立秋／rissyuu - 【BOFXVI】竹 ／ 立秋 feat.ちょこ");
		hs.add("Morimori Atsushi - 【BOFU2016】uma vs. モリモリあつし - Re：End of a Dream【BMS】");
		hs.add("翡乃イスカ(Hino Isuka) - 【BOFU2015】翡乃イスカ - Dreamin' Attraction!!【Arcaea】");
		System.out.println("喜欢的歌");
		Iterator<String> it = hs.iterator();
		int i=0;
		while (it.hasNext()) {
			i++;
			String next = it.next();
			System.out.println(i+".\t"+next);
		}
	}
}
