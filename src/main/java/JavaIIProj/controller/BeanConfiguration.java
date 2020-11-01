package JavaIIProj.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import JavaIIProj.beans.Game;

@Configuration
public class BeanConfiguration {

	@Bean
	public Game game() {
		Game bean = new Game();
		bean.setTitle("new");
		bean.setGenre("adventure");
		bean.setPlayers(1);
		return bean;
	}
}
