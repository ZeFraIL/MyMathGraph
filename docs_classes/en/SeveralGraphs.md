# SeveralGraphs Class Description

## 1. General information
*   **Class Name:** `SeveralGraphs`
*   **Type:** Activity
*   **Purpose:** This class demonstrates how to overlay multiple quadratic functions (parabolas) on a single graph. It cycles through four predefined sets of coefficients to show how changing 'a', 'b', or 'c' affects the parabola's shape and position.
*   **Interaction:** Launched from `MainActivity`. It uses a shared `GraphView` to display multiple `LineGraphSeries`.

## 2. Variables (class fields)
| Name | Type | Purpose | Where is it used |
| :--- | :--- | :--- | :--- |
| `a`, `b`, `c` | `int` | Base coefficients for the parabolas | `viewGraph`, `buildGraph` |
| `numPoints` | `int` | Number of points to calculate for each graph | `buildGraph` |
| `i` | `int` | Counter to keep track of which graph to draw next | `viewGraph`, `buildGraph` |
| `graphS` | `GraphView` | UI component for displaying the graphs | `onCreate`, `buildGraph` |
| `dx` | `double` | The step size for the X-axis calculation | `buildGraph` |
| `colors` | `int[]` | An array of colors (Black, Blue, Red, Magenta) for the graphs | `buildGraph` |

## 3. Classroom Methods

### Method name: `onCreate`
*   **Type:** `protected`
*   **Return value:** `void`
*   **Parameters:** `Bundle savedInstanceState`
*   **What does the method do:** Sets up the layout and initializes the `graphS` reference.
*   **When called:** When the Activity is created.

### Method name: `viewGraph`
*   **Type:** `public`
*   **Return value:** `void`
*   **Parameters:** `View view`
*   **What does the method do:** 
    1. Increments the counter `i`.
    2. Depending on the value of `i`, it calls `buildGraph` with different variations of the base coefficients (e.g., negative 'a', negative 'b', or negative 'c').
*   **When called:** When the user clicks the "View Graph" button.

### Method name: `buildGraph`
*   **Type:** `public`
*   **Return value:** `void`
*   **Parameters:** `int a, int b, int c`
*   **What does the method do:** 
    1. Creates a new `LineGraphSeries`.
    2. Calculates $y = ax^2 + bx + c$ for $x$ ranging from -20 upwards using step `dx`.
    3. Adds the calculated points to the series.
    4. Adds the series to the graph.
    5. Sets the color of the line based on the current counter `i`.
*   **When called:** From `viewGraph`.

## 4. Lifecycle
*   **`onCreate()`:** Initialization and UI binding.

## 5. Interface Interaction (UI)
*   **Button:** Triggers the addition of a new graph with each click.
*   **GraphView:** Accumulates and displays all the added series.

## 6. Interaction with other components
*   Started via Intent from `MainActivity`.

## 7. General logic of the class
Each button click "adds" a new parabola to the existing chart. It uses a counter to decide which mathematical variation to show next, allowing the user to compare four different states of the quadratic equation.

## 8. Simplified explanation
Imagine you have a transparent piece of paper over a grid. Each time you click the button, the app draws a new colored curve. By the fourth click, you have four different curves on the same paper, making it easy to see how changing the numbers in the formula moves the curve around.

**Analogy:** It's like trying on four different colored shirts one over the other to see which one fits the best or how they differ.
