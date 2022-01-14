package org.example.junit;

import org.junit.Before;

import static org.junit.Assert.*;

public class selectsortTest {
    private selectsort Tests;
    @org.junit.Before
    public void setup(){
        Tests = new selectsort();
    }
    @org.junit.Test
    public void isLong() {
        int actuals[] = {1, 5, 2, 7, 3, 6, 4};
        boolean res = Tests.Long(actuals);
        assertEquals(true, res);
    }
    @org.junit.Test
    public void sortAsc() {
        int actuals[] = {1, 5, 2, 7, 3, 6, 4};
        int expecteds[] = {1, 2, 3, 4, 5, 6, 7};
        Tests.sortAsc(actuals);
        assertArrayEquals(expecteds, actuals);
    }

    @org.junit.Test
    public void sortDesc() {
        int actuals[] = {1, 2, 2, 7, 3, 6, 4};
        int expecteds[] = {7, 6, 4, 3, 2, 2, 1};
        Tests.sortDesc(actuals);
        assertArrayEquals(expecteds, actuals);
    }
}