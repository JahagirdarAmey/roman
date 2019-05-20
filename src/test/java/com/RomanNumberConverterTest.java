package com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by USER on 18/05/2019.
 */

public class RomanNumberConverterTest {

    RomanNumberConverter romanNumberConverter;

    @Before
    public void setUp() throws Exception {
        this.romanNumberConverter = new RomanNumberConverter();
    }

    @Test
    public void testGetRomanNumber() throws Exception {

        Assert.assertEquals("I", this.romanNumberConverter.getRomanNumber(1));
        Assert.assertEquals("II", this.romanNumberConverter.getRomanNumber(2));
        Assert.assertEquals("III", this.romanNumberConverter.getRomanNumber(3));
        Assert.assertEquals("IV", this.romanNumberConverter.getRomanNumber(4));
        Assert.assertEquals("V", this.romanNumberConverter.getRomanNumber(5));
        Assert.assertEquals("VI", this.romanNumberConverter.getRomanNumber(6));
        Assert.assertEquals("VII", this.romanNumberConverter.getRomanNumber(7));
        Assert.assertEquals("VIII", this.romanNumberConverter.getRomanNumber(8));
        Assert.assertEquals("IX", this.romanNumberConverter.getRomanNumber(9));
        Assert.assertEquals("X", this.romanNumberConverter.getRomanNumber(10));


        Assert.assertEquals("XI", this.romanNumberConverter.getRomanNumber(11));
        Assert.assertEquals("XII", this.romanNumberConverter.getRomanNumber(12));
        Assert.assertEquals("XIII", this.romanNumberConverter.getRomanNumber(13));
        Assert.assertEquals("XIV", this.romanNumberConverter.getRomanNumber(14));
        Assert.assertEquals("XV", this.romanNumberConverter.getRomanNumber(15));
        Assert.assertEquals("XVI", this.romanNumberConverter.getRomanNumber(16));
        Assert.assertEquals("XVII", this.romanNumberConverter.getRomanNumber(17));
        Assert.assertEquals("XVIII", this.romanNumberConverter.getRomanNumber(18));
        Assert.assertEquals("XIX", this.romanNumberConverter.getRomanNumber(19));
        Assert.assertEquals("XX", this.romanNumberConverter.getRomanNumber(20));


        Assert.assertEquals("XXI", this.romanNumberConverter.getRomanNumber(21));
        Assert.assertEquals("XXII", this.romanNumberConverter.getRomanNumber(22));
        Assert.assertEquals("XXIII", this.romanNumberConverter.getRomanNumber(23));
        Assert.assertEquals("XXIV", this.romanNumberConverter.getRomanNumber(24));
        Assert.assertEquals("XXV", this.romanNumberConverter.getRomanNumber(25));
        Assert.assertEquals("XXVI", this.romanNumberConverter.getRomanNumber(26));
        Assert.assertEquals("XXVII", this.romanNumberConverter.getRomanNumber(27));
        Assert.assertEquals("XXVIII", this.romanNumberConverter.getRomanNumber(28));
        Assert.assertEquals("XXIX", this.romanNumberConverter.getRomanNumber(29));
        Assert.assertEquals("XXX", this.romanNumberConverter.getRomanNumber(30));


        Assert.assertEquals("XXXI", this.romanNumberConverter.getRomanNumber(31));
        Assert.assertEquals("XXXII", this.romanNumberConverter.getRomanNumber(32));
        Assert.assertEquals("XXXIII", this.romanNumberConverter.getRomanNumber(33));
        Assert.assertEquals("XXXIV", this.romanNumberConverter.getRomanNumber(34));
        Assert.assertEquals("XXXV", this.romanNumberConverter.getRomanNumber(35));
        Assert.assertEquals("XXXVI", this.romanNumberConverter.getRomanNumber(36));
        Assert.assertEquals("XXXVII", this.romanNumberConverter.getRomanNumber(37));
        Assert.assertEquals("XXXVIII", this.romanNumberConverter.getRomanNumber(38));
        Assert.assertEquals("XXXIX", this.romanNumberConverter.getRomanNumber(39));
        Assert.assertEquals("XL", this.romanNumberConverter.getRomanNumber(40));


        Assert.assertEquals("XLI", this.romanNumberConverter.getRomanNumber(41));
        Assert.assertEquals("XLII", this.romanNumberConverter.getRomanNumber(42));
        Assert.assertEquals("XLIII", this.romanNumberConverter.getRomanNumber(43));
        Assert.assertEquals("XLIV", this.romanNumberConverter.getRomanNumber(44));
        Assert.assertEquals("XLV", this.romanNumberConverter.getRomanNumber(45));
        Assert.assertEquals("XLVI", this.romanNumberConverter.getRomanNumber(46));
        Assert.assertEquals("XLVII", this.romanNumberConverter.getRomanNumber(47));
        Assert.assertEquals("XLVIII", this.romanNumberConverter.getRomanNumber(48));
        Assert.assertEquals("XLIX", this.romanNumberConverter.getRomanNumber(49));
        Assert.assertEquals("L", this.romanNumberConverter.getRomanNumber(50));


        Assert.assertEquals("LI", this.romanNumberConverter.getRomanNumber(51));
        Assert.assertEquals("LII", this.romanNumberConverter.getRomanNumber(52));
        Assert.assertEquals("LIII", this.romanNumberConverter.getRomanNumber(53));
        Assert.assertEquals("LIV", this.romanNumberConverter.getRomanNumber(54));
        Assert.assertEquals("LV", this.romanNumberConverter.getRomanNumber(55));
        Assert.assertEquals("LVI", this.romanNumberConverter.getRomanNumber(56));
        Assert.assertEquals("LVII", this.romanNumberConverter.getRomanNumber(57));
        Assert.assertEquals("LVIII", this.romanNumberConverter.getRomanNumber(58));
        Assert.assertEquals("LIX", this.romanNumberConverter.getRomanNumber(59));
        Assert.assertEquals("LX", this.romanNumberConverter.getRomanNumber(60));


        Assert.assertEquals("LXI", this.romanNumberConverter.getRomanNumber(61));
        Assert.assertEquals("LXII", this.romanNumberConverter.getRomanNumber(62));
        Assert.assertEquals("LXIII", this.romanNumberConverter.getRomanNumber(63));
        Assert.assertEquals("LXIV", this.romanNumberConverter.getRomanNumber(64));
        Assert.assertEquals("LXV", this.romanNumberConverter.getRomanNumber(65));
        Assert.assertEquals("LXVI", this.romanNumberConverter.getRomanNumber(66));
        Assert.assertEquals("LXVII", this.romanNumberConverter.getRomanNumber(67));
        Assert.assertEquals("LXVIII", this.romanNumberConverter.getRomanNumber(68));
        Assert.assertEquals("LXIX", this.romanNumberConverter.getRomanNumber(69));
        Assert.assertEquals("LXX", this.romanNumberConverter.getRomanNumber(70));


        Assert.assertEquals("LXXI", this.romanNumberConverter.getRomanNumber(71));
        Assert.assertEquals("LXXII", this.romanNumberConverter.getRomanNumber(72));
        Assert.assertEquals("LXXIII", this.romanNumberConverter.getRomanNumber(73));
        Assert.assertEquals("LXXIV", this.romanNumberConverter.getRomanNumber(74));
        Assert.assertEquals("LXXV", this.romanNumberConverter.getRomanNumber(75));
        Assert.assertEquals("LXXVI", this.romanNumberConverter.getRomanNumber(76));
        Assert.assertEquals("LXXVII", this.romanNumberConverter.getRomanNumber(77));
        Assert.assertEquals("LXXVIII", this.romanNumberConverter.getRomanNumber(78));
        Assert.assertEquals("LXXIX", this.romanNumberConverter.getRomanNumber(79));
        Assert.assertEquals("LXXX", this.romanNumberConverter.getRomanNumber(80));


        Assert.assertEquals("LXXXI", this.romanNumberConverter.getRomanNumber(81));
        Assert.assertEquals("LXXXII", this.romanNumberConverter.getRomanNumber(82));
        Assert.assertEquals("LXXXIII", this.romanNumberConverter.getRomanNumber(83));
        Assert.assertEquals("LXXXIV", this.romanNumberConverter.getRomanNumber(84));
        Assert.assertEquals("LXXXV", this.romanNumberConverter.getRomanNumber(85));
        Assert.assertEquals("LXXXVI", this.romanNumberConverter.getRomanNumber(86));
        Assert.assertEquals("LXXXVII", this.romanNumberConverter.getRomanNumber(87));
        Assert.assertEquals("LXXXVIII", this.romanNumberConverter.getRomanNumber(88));
        Assert.assertEquals("LXXXIX", this.romanNumberConverter.getRomanNumber(89));
        Assert.assertEquals("LC", this.romanNumberConverter.getRomanNumber(90));


        Assert.assertEquals("LCI", this.romanNumberConverter.getRomanNumber(91));
        Assert.assertEquals("LCII", this.romanNumberConverter.getRomanNumber(92));
        Assert.assertEquals("LCIII", this.romanNumberConverter.getRomanNumber(93));
        Assert.assertEquals("LCIV", this.romanNumberConverter.getRomanNumber(94));
        Assert.assertEquals("LCV", this.romanNumberConverter.getRomanNumber(95));
        Assert.assertEquals("LCVI", this.romanNumberConverter.getRomanNumber(96));
        Assert.assertEquals("LCVII", this.romanNumberConverter.getRomanNumber(97));
        Assert.assertEquals("LCVIII", this.romanNumberConverter.getRomanNumber(98));
        Assert.assertEquals("LCIX", this.romanNumberConverter.getRomanNumber(99));
        Assert.assertEquals("C", this.romanNumberConverter.getRomanNumber(100));


        Assert.assertEquals("CI", this.romanNumberConverter.getRomanNumber(101));
        Assert.assertEquals("CII", this.romanNumberConverter.getRomanNumber(102));
        Assert.assertEquals("CIII", this.romanNumberConverter.getRomanNumber(103));
        Assert.assertEquals("CIV", this.romanNumberConverter.getRomanNumber(104));
        Assert.assertEquals("CV", this.romanNumberConverter.getRomanNumber(105));
        Assert.assertEquals("CVI", this.romanNumberConverter.getRomanNumber(106));
        Assert.assertEquals("CVII", this.romanNumberConverter.getRomanNumber(107));
        Assert.assertEquals("CVIII", this.romanNumberConverter.getRomanNumber(108));
        Assert.assertEquals("CIX", this.romanNumberConverter.getRomanNumber(109));
        Assert.assertEquals("CX", this.romanNumberConverter.getRomanNumber(110));
        Assert.assertEquals("CXI", this.romanNumberConverter.getRomanNumber(111));
        Assert.assertEquals("CXII", this.romanNumberConverter.getRomanNumber(112));
        Assert.assertEquals("CXIII", this.romanNumberConverter.getRomanNumber(113));
        Assert.assertEquals("CXIV", this.romanNumberConverter.getRomanNumber(114));
        Assert.assertEquals("CXV", this.romanNumberConverter.getRomanNumber(115));
        Assert.assertEquals("CXVI", this.romanNumberConverter.getRomanNumber(116));
        Assert.assertEquals("CXVII", this.romanNumberConverter.getRomanNumber(117));
        Assert.assertEquals("CXVIII", this.romanNumberConverter.getRomanNumber(118));
        Assert.assertEquals("CXIX", this.romanNumberConverter.getRomanNumber(119));
        Assert.assertEquals("CXX", this.romanNumberConverter.getRomanNumber(120));
        Assert.assertEquals("CXXI", this.romanNumberConverter.getRomanNumber(121));
        Assert.assertEquals("CXXII", this.romanNumberConverter.getRomanNumber(122));
        Assert.assertEquals("CXXIII", this.romanNumberConverter.getRomanNumber(123));
        Assert.assertEquals("CXXIV", this.romanNumberConverter.getRomanNumber(124));
        Assert.assertEquals("CXXV", this.romanNumberConverter.getRomanNumber(125));
        Assert.assertEquals("CXXVI", this.romanNumberConverter.getRomanNumber(126));
        Assert.assertEquals("CXXVII", this.romanNumberConverter.getRomanNumber(127));
        Assert.assertEquals("CXXVIII", this.romanNumberConverter.getRomanNumber(128));
        Assert.assertEquals("CXXIX", this.romanNumberConverter.getRomanNumber(129));
        Assert.assertEquals("CXXX", this.romanNumberConverter.getRomanNumber(130));
        Assert.assertEquals("CXXXI", this.romanNumberConverter.getRomanNumber(131));
        Assert.assertEquals("CXXXII", this.romanNumberConverter.getRomanNumber(132));
        Assert.assertEquals("CXXXIII", this.romanNumberConverter.getRomanNumber(133));
        Assert.assertEquals("CXXXIV", this.romanNumberConverter.getRomanNumber(134));
        Assert.assertEquals("CXXXV", this.romanNumberConverter.getRomanNumber(135));
        Assert.assertEquals("CXXXVI", this.romanNumberConverter.getRomanNumber(136));
        Assert.assertEquals("CXXXVII", this.romanNumberConverter.getRomanNumber(137));
        Assert.assertEquals("CXXXVIII", this.romanNumberConverter.getRomanNumber(138));
        Assert.assertEquals("CXXXIX", this.romanNumberConverter.getRomanNumber(139));
        Assert.assertEquals("CXL", this.romanNumberConverter.getRomanNumber(140));
        Assert.assertEquals("CXLI", this.romanNumberConverter.getRomanNumber(141));
        Assert.assertEquals("CXLII", this.romanNumberConverter.getRomanNumber(142));
        Assert.assertEquals("CXLIII", this.romanNumberConverter.getRomanNumber(143));
        Assert.assertEquals("CXLIV", this.romanNumberConverter.getRomanNumber(144));
        Assert.assertEquals("CXLV", this.romanNumberConverter.getRomanNumber(145));
        Assert.assertEquals("CXLVI", this.romanNumberConverter.getRomanNumber(146));
        Assert.assertEquals("CXLVII", this.romanNumberConverter.getRomanNumber(147));
        Assert.assertEquals("CXLVIII", this.romanNumberConverter.getRomanNumber(148));
        Assert.assertEquals("CXLIX", this.romanNumberConverter.getRomanNumber(149));
        Assert.assertEquals("CL", this.romanNumberConverter.getRomanNumber(150));
        Assert.assertEquals("CLI", this.romanNumberConverter.getRomanNumber(151));
        Assert.assertEquals("CLII", this.romanNumberConverter.getRomanNumber(152));
        Assert.assertEquals("CLIII", this.romanNumberConverter.getRomanNumber(153));
        Assert.assertEquals("CLIV", this.romanNumberConverter.getRomanNumber(154));
        Assert.assertEquals("CLV", this.romanNumberConverter.getRomanNumber(155));
        Assert.assertEquals("CLVI", this.romanNumberConverter.getRomanNumber(156));
        Assert.assertEquals("CLVII", this.romanNumberConverter.getRomanNumber(157));
        Assert.assertEquals("CLVIII", this.romanNumberConverter.getRomanNumber(158));
        Assert.assertEquals("CLIX", this.romanNumberConverter.getRomanNumber(159));
        Assert.assertEquals("CLX", this.romanNumberConverter.getRomanNumber(160));
        Assert.assertEquals("CLXI", this.romanNumberConverter.getRomanNumber(161));
        Assert.assertEquals("CLXII", this.romanNumberConverter.getRomanNumber(162));
        Assert.assertEquals("CLXIII", this.romanNumberConverter.getRomanNumber(163));
        Assert.assertEquals("CLXIV", this.romanNumberConverter.getRomanNumber(164));
        Assert.assertEquals("CLXV", this.romanNumberConverter.getRomanNumber(165));
        Assert.assertEquals("CLXVI", this.romanNumberConverter.getRomanNumber(166));
        Assert.assertEquals("CLXVII", this.romanNumberConverter.getRomanNumber(167));
        Assert.assertEquals("CLXVIII", this.romanNumberConverter.getRomanNumber(168));
        Assert.assertEquals("CLXIX", this.romanNumberConverter.getRomanNumber(169));
        Assert.assertEquals("CLXX", this.romanNumberConverter.getRomanNumber(170));
        Assert.assertEquals("CLXXI", this.romanNumberConverter.getRomanNumber(171));
        Assert.assertEquals("CLXXII", this.romanNumberConverter.getRomanNumber(172));
        Assert.assertEquals("CLXXIII", this.romanNumberConverter.getRomanNumber(173));
        Assert.assertEquals("CLXXIV", this.romanNumberConverter.getRomanNumber(174));
        Assert.assertEquals("CLXXV", this.romanNumberConverter.getRomanNumber(175));
        Assert.assertEquals("CLXXVI", this.romanNumberConverter.getRomanNumber(176));
        Assert.assertEquals("CLXXVII", this.romanNumberConverter.getRomanNumber(177));
        Assert.assertEquals("CLXXVIII", this.romanNumberConverter.getRomanNumber(178));
        Assert.assertEquals("CLXXIX", this.romanNumberConverter.getRomanNumber(179));
        Assert.assertEquals("CLXXX", this.romanNumberConverter.getRomanNumber(180));
        Assert.assertEquals("CLXXXI", this.romanNumberConverter.getRomanNumber(181));
        Assert.assertEquals("CLXXXII", this.romanNumberConverter.getRomanNumber(182));
        Assert.assertEquals("CLXXXIII", this.romanNumberConverter.getRomanNumber(183));
        Assert.assertEquals("CLXXXIV", this.romanNumberConverter.getRomanNumber(184));
        Assert.assertEquals("CLXXXV", this.romanNumberConverter.getRomanNumber(185));
        Assert.assertEquals("CLXXXVI", this.romanNumberConverter.getRomanNumber(186));
        Assert.assertEquals("CLXXXVII", this.romanNumberConverter.getRomanNumber(187));
        Assert.assertEquals("CLXXXVIII", this.romanNumberConverter.getRomanNumber(188));
        Assert.assertEquals("CLXXXIX", this.romanNumberConverter.getRomanNumber(189));
        Assert.assertEquals("CXC", this.romanNumberConverter.getRomanNumber(190));
        Assert.assertEquals("CXCI", this.romanNumberConverter.getRomanNumber(191));
        Assert.assertEquals("CXCII", this.romanNumberConverter.getRomanNumber(192));
        Assert.assertEquals("CXCIII", this.romanNumberConverter.getRomanNumber(193));
        Assert.assertEquals("CXCIV", this.romanNumberConverter.getRomanNumber(194));
        Assert.assertEquals("CXCV", this.romanNumberConverter.getRomanNumber(195));
        Assert.assertEquals("CXCVI", this.romanNumberConverter.getRomanNumber(196));
        Assert.assertEquals("CXCVII", this.romanNumberConverter.getRomanNumber(197));
        Assert.assertEquals("CXCVIII", this.romanNumberConverter.getRomanNumber(198));
        Assert.assertEquals("CXCIX", this.romanNumberConverter.getRomanNumber(199));
        Assert.assertEquals("CC", this.romanNumberConverter.getRomanNumber(200));

    }

}
