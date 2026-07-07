# LinearFunction Class Description

## 1. General information
*   **Class Name:** `LinearFunction`
*   **Type:** Activity
*   **Purpose:** This class is responsible for visualizing a linear function of the form $y = ax + b$. It takes user input for coefficients 'a' and 'b' and draws the corresponding line on a graph.
*   **Interaction:** It is launched from the `MainActivity` via an `Intent`. It uses the `GraphView` library to render the mathematical plot.

## 2. Variables (class fields)
| Name | Type | Purpose | Where is it used |
| :--- | :--- | :--- | :--- |
| `etA1` | `EditText` | Input field for coefficient 'a' | `onCreate`, `viewGraph` |
| `etB1` | `EditText` | Input field for coefficient 'b' | `onCreate`, `viewGraph` |
| `stA` | `String` | Temporary storage for text from `etA1` | `viewGraph` |
| `stB` | `String` | Temporary storage for text from `etB1` | `viewGraph` |
| `a` | `int` | Numerical value of coefficient 'a' | `viewGraph` |
| `b` | `int` | Numerical value of coefficient 'b' | `viewGraph` |
| `graphL` | `GraphView` | UI component that displays the graph | `onCreate`, `viewGraph` |
| `x` | `double` | The x-coordinate of the function's root ($y=0$) | `viewGraph` |
| `xL` | `double` | The x-coordinate for the left point of the line | `viewGraph` |
| `xR` | `double` | The x-coordinate for the right point of the line | `viewGraph` |
| `y` | `double` | Calculated y-coordinate | `viewGraph` |

## 3. Classroom Methods

### Method name: `onCreate`
*   **Type:** `protected`
*   **Return value:** `void` (returns nothing)
*   **Parameters:** `Bundle savedInstanceState` (contains saved state of the activity)
*   **What does the method do:**
    1.  Calls the parent class constructor.
    2.  Sets the layout to `activity_linear_function`.
    3.  Links the Java variables (`etA1`, `etB1`, `graphL`) to their counterparts in the XML layout using `findViewById`.
*   **When called:** Automatically by the Android system when the screen is first created.

### Method name: `viewGraph`
*   **Type:** `public`
*   **Return value:** `void`
*   **Parameters:** `View view` (the button that was clicked)
*   **What does the method do:**
    1.  Reads the text from input fields.
    2.  Checks if fields are empty (basic validation).
    3.  Converts text to integers (`Integer.parseInt`).
    4.  Calculates the root of the function: $x = -b / a$.
    5.  Creates a new `LineGraphSeries`.
    6.  Calculates two points: one 5 units to the left of the root and one 5 units to the right.
    7.  Adds these points to the series and adds the series to the graph.
*   **When called:** When the user clicks the "View Graph" button.
*   **Important to understand:** 
    *   **Potential Bug:** If the user enters `a = 0`, the program will crash due to division by zero.
    *   **Feature:** It only uses two points to draw the line because a linear function is always a straight line.

## 4. Lifecycle
*   **`onCreate()`:** Called when the activity starts. This is where we set up the UI and find our views.

## 5. Interface Interaction (UI)
*   **Elements:** `EditText` (for numbers), `Button` (to trigger calculation), `GraphView` (to show the result).
*   **Connection:** `findViewById` is used to link XML IDs to Java objects.
*   **Events:** `onClick` event on the button (defined in XML using `android:onClick="viewGraph"`).

## 6. Interaction with other components
*   **Intent:** This Activity is opened from `MainActivity`.
*   **Data Transfer:** It doesn't receive data from other screens; it relies on user input.

## 7. General logic of the class
1.  User enters 'a' and 'b'.
2.  User presses the button.
3.  The app calculates where the line crosses the X-axis.
4.  The app draws a straight line through that point.

## 8. Simplified explanation
Imagine you have a ruler and you want to draw a line on a piece of paper. To do this, you need at least two points. This class calculates those two points based on the numbers you give it and uses a "digital ruler" (the `GraphView` library) to draw the line for you.

**Analogy:** It's like a recipe. You give it the ingredients (numbers 'a' and 'b'), and it cooks a drawing of a line.
