/*
 * Copyright (c) 2016. The Acceml.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hit.learn.thinkinginjava.Arrays.Generator;


/**
 * Created by Acceml on 2016/5/4.
 * Email: huminghit@gmail.com
 */
public class GeneratorTest {
    public static int size = 10;

    public static void test(Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.println(type.getSimpleName());
            try {
                Generator<?> g = (Generator<?>) type.newInstance();
            }catch (Exception e) {

            }
        }
    }
}
