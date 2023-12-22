package com.shira.module2_3;

import java.util.Comparator;

/**
 * A class that represents a compator for cards, based on the rank.
 * @author Shira Rubin
 * @version 1
 */
public class RankComparator implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        return o1.rank.getValue() - o2.rank.getValue();
    }
}
