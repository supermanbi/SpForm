package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dto.Preferences;

@Controller
@PropertySource(value = "classpath:data.properties")
public class PreferencesController {

	@Value("#{'${technic_name}'}")
	private String technicName;

	@PostMapping("/subscription")
	public String subcription(@ModelAttribute("preferences") Preferences preferences, Model model) {
		System.out.println(preferences);

		model.addAttribute("preferences", preferences);
		return "newsletter_subscription";
	}

	@GetMapping(value = { "/showForm", "/" })
	public String showForm(Model model) {
		System.out.println(technicName);
		model.addAttribute("preferences", new Preferences());
		return "newsletter";
	}
}
