package com.olexyn.aski.title;

import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;

public class App {
	public static void main(String[] args) throws IOException {
		// Specify the text you want to convert to ASCII art
		String inputText = "Hello, ASCII Art!";

		String dir = System.getProperty("user.dir");
		String fontDir = dir + "/src/main/resources/fonts/";
		String fontPath = fontDir + "small.flf";
		String asciiArt = FigletFont.convertOneLine(fontPath, inputText);

		// Print the generated ASCII art
		System.out.println(asciiArt);
	}
}
