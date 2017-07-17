package conway;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jagtapm on 7/17/2017.
 */
public class ConwayTest {
    @Test
    public void gameLife() {
        Boolean[][] check = {
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, true, false, false},
                {false, false, false, true, false, false, false},
                {false, false, false, true, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
        };
        Boolean[][] output = {{false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, true, true, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false},
        };
        Assert.assertEquals("Expected output", output, ConwayGame.next(check));
    }
        @Test
        public void gameLife1() {
            Boolean[][] check1 = {
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, true, false, false, false},
                    {false, false, false, true, false, false, false},
                    {false, false, false, true, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
            };
            Boolean[][] output1 = {{false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, true, true, true, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
            };
            Assert.assertEquals("Expected output", output1, ConwayGame.next(check1));
        }
        @Test
        public void gameLife2() {
            Boolean[][] check2 = {
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, true, true, false, false},
                    {false, false, false, true, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
            };
            Boolean[][] output2 = {{false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, true, true, false, false},
                    {false, false, false, true, true, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
            };
            Assert.assertEquals("Expected output", output2, ConwayGame.next(check2));
        }
        @Test
        public void gameLife3() {
            Boolean[][] check3 = {
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, true, false, false, false},
                    {false, false, true, false, false, false, false},
                    {false, true, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
            };
            Boolean[][] output3 = {{false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, true, false, false, false, false},
                    {false, false, false, false, false, false, false},
                    {false, false, false, false, false, false, false},
            };
            Assert.assertEquals("Expected output", output3, ConwayGame.next(check3));
        }
    }

