package jp.co.sss.practice.p04.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p04.q01.form.BmiForm;

@Controller
public class Practice0401Controller {

	@RequestMapping(path = "/bmi/input", method = RequestMethod.GET)
	public String input() {
		return "practice04/01/bmi_input";
	}

	@RequestMapping(path = "/bmi/result", method = RequestMethod.POST)
	public String input2(BmiForm bmiForm, Model model) {
		Double weight = bmiForm.getWeight();
		Double height = bmiForm.getHeight() / 100;
		Double bmi = weight / ((height) * (height));
		model.addAttribute("name", bmiForm.getName());
		model.addAttribute("weight", bmiForm.getWeight());
		model.addAttribute("height", bmiForm.getHeight());
		model.addAttribute("bmi", bmi);
		return "practice04/01/bmi_result";
	}

}
