# QuadraticFunction Class Description

## 1. General information
*   **Class Name:** `QuadraticFunction`
*   **Type:** Activity
*   **Purpose:** This class visualizes a quadratic function (parabola) of the form $y = ax^2 + bx + c$. It calculates the shape of the parabola based on user coefficients and allows interactive exploration of the points.
*   **Interaction:** Launched from `MainActivity`. Uses `GraphView` for rendering and `Toast` for displaying point coordinates.

## 2. Variables (class fields)
| Name | Type | Purpose | Where is it used |
| :--- | :--- | :--- | :--- |
| `etA2`, `etB2`, `etC2` | `EditText` | Input fields for $a, b, c$ | `onCreate`, `viewGraph` |
| `stA`, `stB`, `stC` | `String` | Strings to read from EditText | `viewGraph` |
| `a`, `b`, `c` | `int` | Numerical coefficients | `viewGraph` |
| `numPoints` | `int` | Number of segments to draw the curve | `viewGraph` |
| `graphQ` | `GraphView` | The plot container | `onCreate`, `viewGraph` |
| `d` | `double` | Discriminant ($\Delta = b^2 - 4ac$) | `viewGraph` |
| `x1`, `x2` | `double` | Roots of the equation | `viewGraph` |
| `xmin` | `double` | Vertex X-coordinate | `viewGraph` |
| `dx` | `double` | Step size between points | `viewGraph` |
| `xL`, `xR` | `double` | Left and right bounds for drawing | `viewGraph` |

## 3. Classroom Methods

### Method name: `onCreate`
*   **Type:** `protected`
*   **Return value:** `void`
*   **Parameters:** `Bundle savedInstanceState`
*   **What does the method do:** Sets up the UI and initializes references to the input fields and the graph view.

### Method name: `viewGraph`
*   **Type:** `public`
*   **Return value:** `void`
*   **Parameters:** `View view`
*   **What does the method do:**
    1.  Reads and parses $a, b, c$.
    2.  Calculates the discriminant `d`.
    3.  Determines the viewing range (`xL` to `xR`) based on whether the parabola has roots and its direction (up/down).
    4.  Calculates the step `dx` based on `numPoints`.
    5.  Runs a loop from 1 to `numPoints+1`, calculating $y$ for each $x$ and adding it to the series.
    6.  Enables animation and adds a listener to show a `Toast` message with coordinates when a user taps a point.
*   **When called:** On button click.
*   **Important to understand:**
    *   The logic for determining `xL` and `xR` ensures the "interesting" part of the parabola (the vertex and roots) is visible.
    *   `series.setAnimated(true)` makes the drawing process smooth.

## 4. Lifecycle
*   **`onCreate()`:** Initialization of the activity.

## 5. Interface Interaction (UI)
*   Uses three `EditText` for inputs.
*   `Toast` messages are used for interactive feedback.

## 6. Interaction with other components
*   Standard Activity transition from `MainActivity`.

## 7. General logic of the class
It's a mathematical calculator that translates an algebraic formula into a set of 100 small line segments that look like a smooth curve (parabola).

## 8. Simplified explanation
Think of this as a "Parabola Builder". You give it the recipe ($a, b, c$), and it calculates 100 tiny dots and connects them. If you touch any dot, it tells you exactly where it is.
