package org.coursera.aiplanning.pddl;

import java.io.File;
import java.io.FileInputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.coursera.aiplanning.pddl.antlr.pddlLexer;
import org.coursera.aiplanning.pddl.antlr.pddlParser;




/**
 * 
 * @author alessandroumbrico
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try {
			File source = new File(Main.class.getResource("domains/aiplanning_dwr_domain.pddl").toURI());
			ANTLRInputStream in = new ANTLRInputStream(new FileInputStream(source));
			pddlLexer lexer = new pddlLexer(in);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			pddlParser parser = new pddlParser(tokens);
			// call the grammar starting rule
			parser.pddlDoc();
		}
		catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
}
