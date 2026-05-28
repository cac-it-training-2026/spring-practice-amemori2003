package jp.co.sss.practice.p03.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p03.q02.form.FavoriteForm;

@Controller
public class Practice0302Controller {

	@RequestMapping(path = "/favorite/input")
	public String favorite() {
		return "practice03/02/favorite_input";

	}

	@RequestMapping(path = "/favorite/result", method = RequestMethod.POST)
	public String favorite2(FavoriteForm favoriteForm) {
		System.out.println("==パラメーターを受け取りました");
		System.out.println("==果物:りんご");
		System.out.println("==スナック:ポテトチップスのりしお");
		System.out.println("==スイーツ:ガトーショコラ");
		System.out.println("==おかず:かぼちゃサラダ");

		return "practice03/02/favorite_result";
	}

}