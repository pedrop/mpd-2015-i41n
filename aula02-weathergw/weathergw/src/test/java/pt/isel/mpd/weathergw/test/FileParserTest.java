/*
 * Copyright (C) 2015 Miguel Gamboa at CCISEL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pt.isel.mpd.weathergw.test;

import java.io.IOException;
import junit.framework.Assert;
import junit.framework.TestCase;
import pt.isel.mpd.weathergw.FileParser;

/**
 *
 * @author Miguel Gamboa at CCISEL
 */
public class FileParserTest extends TestCase{
    
    public void test_read_all_lines_from_resource_weather_data() throws IOException {
        Iterable<String> lines = 
                FileParser.parseResourceAsIterable("data/weather-lisbon-history.csv");
        int count = 0;
        for (String line : lines) {
            count++;
        }
        Assert.assertEquals(72, count);
    }
}
