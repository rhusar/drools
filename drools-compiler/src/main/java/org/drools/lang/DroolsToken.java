package org.drools.lang;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * An extension of the CommonToken class that keeps the char offset
 * information
 * 
 * @author porcelli
 * 
 */
public class DroolsToken extends CommonToken {

	private static final long serialVersionUID = 3635806195731072579L;

	public DroolsToken(int type) {
		super(type);
	}

	public DroolsToken(CharStream input, int type, int channel, int start,
			int stop) {
		super(input, type, channel, start, stop);
	}

	public DroolsToken(int type, String text) {
		super(type, text);
	}

	/**
	 * Constructor that preserves the char offset
	 * 
	 * @param oldToken
	 */
	public DroolsToken(Token oldToken) {
		super(oldToken);
		if (null != oldToken
				&& (oldToken.getClass().equals(CommonToken.class) || oldToken
						.getClass().equals(DroolsToken.class))) {
			start = ((CommonToken) oldToken).getStartIndex();
			stop = ((CommonToken) oldToken).getStopIndex();
		}
	}
}