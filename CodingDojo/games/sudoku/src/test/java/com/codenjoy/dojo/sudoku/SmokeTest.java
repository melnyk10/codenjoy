package com.codenjoy.dojo.sudoku;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2018 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.client.local.LocalGameRunner;
import com.codenjoy.dojo.services.Dice;
import com.codenjoy.dojo.sudoku.client.Board;
import com.codenjoy.dojo.sudoku.client.ai.AISolver;
import com.codenjoy.dojo.sudoku.services.GameRunner;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SmokeTest {

    @Test
    public void test() {
        // given
        List<String> messages = new LinkedList<>();

        LocalGameRunner.timeout = 0;
        LocalGameRunner.out = (e) -> messages.add(e);
        LocalGameRunner.countIterations = 35;

        Dice dice = LocalGameRunner.getDice(0);

        GameRunner gameType = new GameRunner() {
            @Override
            public Dice getDice() {
                return dice;
            }
        };

        // when
        LocalGameRunner.run(gameType,
                new AISolver(dice),
                new Board());

        // then
        assertEquals("1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼8 6☼ 1 ☼7  ☼\n" +
                    "1:☼21 ☼7 6☼ 53☼\n" +
                    "1:☼4 5☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼   ☼973☼ 62☼\n" +
                    "1:☼3 2☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼ 41☼ 52☼3  ☼\n" +
                    "1:☼  8☼ 37☼ 19☼\n" +
                    "1:☼7 3☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 0\n" +
                    "1:Answer: ACT(1,7,9)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼8 6☼ 1 ☼7  ☼\n" +
                    "1:☼21 ☼7 6☼ 53☼\n" +
                    "1:☼4 5☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼   ☼973☼ 62☼\n" +
                    "1:☼3 2☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼  8☼ 37☼ 19☼\n" +
                    "1:☼7 3☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 10\n" +
                    "1:Answer: ACT(1,8,5)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼8 6☼ 1 ☼7  ☼\n" +
                    "1:☼21 ☼7 6☼ 53☼\n" +
                    "1:☼4 5☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼   ☼973☼ 62☼\n" +
                    "1:☼3 2☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼5 8☼ 37☼ 19☼\n" +
                    "1:☼7 3☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 20\n" +
                    "1:Answer: ACT(1,5,1)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼8 6☼ 1 ☼7  ☼\n" +
                    "1:☼21 ☼7 6☼ 53☼\n" +
                    "1:☼4 5☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼1  ☼973☼ 62☼\n" +
                    "1:☼3 2☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼5 8☼ 37☼ 19☼\n" +
                    "1:☼7 3☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 30\n" +
                    "1:Answer: ACT(2,1,3)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼21 ☼7 6☼ 53☼\n" +
                    "1:☼4 5☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼1  ☼973☼ 62☼\n" +
                    "1:☼3 2☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼5 8☼ 37☼ 19☼\n" +
                    "1:☼7 3☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 40\n" +
                    "1:Answer: ACT(2,3,7)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼21 ☼7 6☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼1  ☼973☼ 62☼\n" +
                    "1:☼3 2☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼5 8☼ 37☼ 19☼\n" +
                    "1:☼7 3☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 50\n" +
                    "1:Answer: ACT(2,6,5)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼21 ☼7 6☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼1  ☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼5 8☼ 37☼ 19☼\n" +
                    "1:☼7 3☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 60\n" +
                    "1:Answer: ACT(2,5,8)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼21 ☼7 6☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼18 ☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼5 8☼ 37☼ 19☼\n" +
                    "1:☼7 3☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 70\n" +
                    "1:Answer: ACT(2,9,2)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼21 ☼7 6☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼18 ☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼5 8☼ 37☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 80\n" +
                    "1:Answer: ACT(2,8,6)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼21 ☼7 6☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼18 ☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼568☼ 37☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 90\n" +
                    "1:Answer: ACT(3,2,9)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼219☼7 6☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼69 ☼  4☼13 ☼\n" +
                    "1:☼18 ☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼568☼ 37☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 100\n" +
                    "1:Answer: ACT(3,4,7)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼219☼7 6☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼  4☼13 ☼\n" +
                    "1:☼18 ☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼568☼ 37☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 110\n" +
                    "1:Answer: ACT(3,5,4)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼219☼7 6☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼  4☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼ 52☼3  ☼\n" +
                    "1:☼568☼ 37☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 120\n" +
                    "1:Answer: ACT(4,7,8)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼219☼7 6☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼  4☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼ 37☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 130\n" +
                    "1:Answer: ACT(4,8,4)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼219☼7 6☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼  4☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 140\n" +
                    "1:Answer: ACT(5,2,4)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼219☼746☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼  4☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 150\n" +
                    "1:Answer: ACT(5,4,2)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼219☼746☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼ 24☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 160\n" +
                    "1:Answer: ACT(4,4,5)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼ 1 ☼7  ☼\n" +
                    "1:☼219☼746☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 170\n" +
                    "1:Answer: ACT(4,1,2)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼21 ☼7  ☼\n" +
                    "1:☼219☼746☼ 53☼\n" +
                    "1:☼475☼3 8☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 180\n" +
                    "1:Answer: ACT(5,3,9)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼21 ☼7  ☼\n" +
                    "1:☼219☼746☼ 53☼\n" +
                    "1:☼475☼398☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 190\n" +
                    "1:Answer: ACT(6,1,5)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼7  ☼\n" +
                    "1:☼219☼746☼ 53☼\n" +
                    "1:☼475☼398☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼68 ☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 200\n" +
                    "1:Answer: ACT(6,6,1)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼7  ☼\n" +
                    "1:☼219☼746☼ 53☼\n" +
                    "1:☼475☼398☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼16 ☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 210\n" +
                    "1:Answer: ACT(6,9,9)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼7  ☼\n" +
                    "1:☼219☼746☼ 53☼\n" +
                    "1:☼475☼398☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 220\n" +
                    "1:Answer: ACT(7,2,8)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼7  ☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼ 62☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 230\n" +
                    "1:Answer: ACT(7,5,5)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼7  ☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼ 19☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 240\n" +
                    "1:Answer: ACT(7,8,2)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼7  ☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼219☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 250\n" +
                    "1:Answer: ACT(8,1,9)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼79 ☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼6  ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼219☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 260\n" +
                    "1:Answer: ACT(8,3,2)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼79 ☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼62 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼3  ☼\n" +
                    "1:☼568☼437☼219☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 270\n" +
                    "1:Answer: ACT(8,7,7)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼79 ☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼62 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼37 ☼\n" +
                    "1:☼568☼437☼219☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 280\n" +
                    "1:Answer: ACT(9,1,4)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼794☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼62 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼37 ☼\n" +
                    "1:☼568☼437☼219☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 290\n" +
                    "1:Answer: ACT(9,3,1)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼794☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼621☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼13 ☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼37 ☼\n" +
                    "1:☼568☼437☼219☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 300\n" +
                    "1:Answer: ACT(9,4,8)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼794☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼621☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼138☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼94 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼37 ☼\n" +
                    "1:☼568☼437☼219☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 310\n" +
                    "1:Answer: ACT(9,6,7)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼794☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼621☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼138☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼947☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼37 ☼\n" +
                    "1:☼568☼437☼219☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 320\n" +
                    "1:Answer: ACT(9,7,6)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼794☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼621☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼138☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼947☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼376☼\n" +
                    "1:☼568☼437☼219☼\n" +
                    "1:☼723☼169☼48 ☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 330\n" +
                    "1:Answer: ACT(9,9,5)\n" +
                    "1:Fire Event: SUCCESS\n" +
                    "1:Fire Event: WIN\n" +
                    "------------------------------------------\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼836☼215☼794☼\n" +
                    "1:☼219☼746☼853☼\n" +
                    "1:☼475☼398☼621☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼697☼524☼138☼\n" +
                    "1:☼184☼973☼562☼\n" +
                    "1:☼352☼681☼947☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:☼941☼852☼376☼\n" +
                    "1:☼568☼437☼219☼\n" +
                    "1:☼723☼169☼485☼\n" +
                    "1:☼☼☼☼☼☼☼☼☼☼☼☼☼\n" +
                    "1:\n" +
                    "1:Scores: 1340\n" +
                    "1:Answer: ACT(0)\n" +
                    "1:PLAYER_GAME_OVER -> START_NEW_GAME\n" +
                    "------------------------------------------",
                String.join("\n", messages));

    }
}
