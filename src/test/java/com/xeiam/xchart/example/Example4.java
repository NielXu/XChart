/**
 * Copyright 2011-2012 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.xchart.example;

import java.util.ArrayList;
import java.util.List;

import com.xeiam.xchart.Chart;
import com.xeiam.xchart.QuickChart;
import com.xeiam.xchart.swing.SwingWrapper;

/**
 * Create a chart matrix
 * 
 * @author timmolter
 */
public class Example4 {

  public static void main(String[] args) {

    int numRows = 2;
    int numCols = 2;

    List<Chart> charts = new ArrayList<Chart>();

    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        charts.add(QuickChart.getChart(i + "," + j, "X", "Y", null, null, getRandomWalk(1000)));
      }
    }
    new SwingWrapper(charts, numRows, numCols).displayChartMatrix();
  }

  /**
   * Generates a set of random walk data
   * 
   * @param numPoints
   * @return
   */
  private static double[] getRandomWalk(int numPoints) {

    double[] y = new double[numPoints];
    y[0] = 0;
    for (int i = 1; i < y.length; i++) {
      y[i] = y[i - 1] + Math.random() - .5;
    }
    return y;
  }
}
