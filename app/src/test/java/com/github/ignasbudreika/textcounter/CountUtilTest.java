package com.github.ignasbudreika.textcounter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountUtilTest {

    @Test
    public void shouldReturnWordsCount_whenProperTextProvided() {
        String text = "some actually proper text";

        int result = CountUtil.count(text, true);

        assertEquals(4, result);
    }

    @Test
    public void shouldReturnWordsCount_whenComplexTextProvided() {
        String text = "let's pretend it is a complex text! words: 9";

        int result = CountUtil.count(text, true);

        assertEquals(9, result);
    }

    @Test
    public void shouldReturnZeroWords_whenEmptyTextProvided() {
        String text = "";

        int result = CountUtil.count(text, true);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnZeroWords_whenBlankTextProvided() {
        String text = "   ";

        int result = CountUtil.count(text, true);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnZeroWords_whenOnlyPunctuationMarksProvided() {
        String text = ",-.!?:; ";

        int result = CountUtil.count(text, true);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnZeroWords_whenNullTextProvided() {
        String text = null;

        int result = CountUtil.count(text, true);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnCharactersCount_whenProperTextProvided() {
        String text = "some actually proper text";

        int result = CountUtil.count(text, false);

        assertEquals(25, result);
    }

    @Test
    public void shouldReturnCharactersCount_whenComplexTextProvided() {
        String text = "let's pretend it is a complex text! words: 9";

        int result = CountUtil.count(text, false);

        assertEquals(44, result);
    }

    @Test
    public void shouldReturnZeroCharacters_whenEmptyTextProvided() {
        String text = "";

        int result = CountUtil.count(text, false);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnCharactersCount_whenBlankTextProvided() {
        String text = "   ";

        int result = CountUtil.count(text, false);

        assertEquals(3, result);
    }

    @Test
    public void shouldReturnCharactersCount_whenOnlyPunctuationMarksProvided() {
        String text = ",-.!?:; ";

        int result = CountUtil.count(text, false);

        assertEquals(8, result);
    }

    @Test
    public void shouldReturnZeroCharacters_whenNullTextProvided() {
        String text = null;

        int result = CountUtil.count(text, false);

        assertEquals(0, result);
    }
}
