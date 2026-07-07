# CircleFunction Class Description

## 1. General information
*   **Class Name:** `CircleFunction`
*   **Type:** Activity
*   **Purpose:** This class visualizes a circle and a radius line. Since a circle is not a single function (one $x$ can have two $y$ values), it draws it using two separate mathematical series: the top half and the bottom half.
*   **Interaction:** Launched from `MainActivity`.

## 2. Variables (class fields)
| Name | Type | Purpose | Where is it used |
| :--- | :--- | :--- | :--- |
| `amp` | `int` | The radius of the circle | `onCreate` |
| `numPoints` | `int` | Number of points to calculate for the halves | `onCreate` |
| `graphCircle` | `GraphView` | UI component to display the circle | `onCreate` |
| `series1`, `series2` | `LineGraphSeries` | Used for the top and bottom halves of the circle | `onCreate` |
| `series3` | `LineGraphSeries` | Used to draw a radius line at a 30-degree angle | `onCreate` |

## 3. Classroom Methods

### Method name: `onCreate`
*   **Type:** `protected`
*   **Return value:** `void`
*   **Parameters:** `Bundle savedInstanceState`
*   **What does the method do:** 
    1. Initializes the UI.
    2. **Top Half:** Loops from -100 to 100, calculating $y = \sqrt{R^2 - x^2}$ (where $R$ is `amp`).
    3. **Bottom Half:** Loops from -100 to 100, calculating $y = -\sqrt{R^2 - x^2}$.
    4. **Radius Line:** Adds two points: (0,0) and a point on the circle at 30 degrees using $x = R \cdot \cos(30^\circ)$ and $y = R \cdot \sin(30^\circ)$.
    5. Adds all three series to the graph.
*   **When called:** When the Activity is created.

## 4. Lifecycle
*   **`onCreate()`:** All calculation and drawing happen immediately upon opening.

## 5. Interface Interaction (UI)
*   **GraphView:** Displays the static drawing of the circle and its radius.

## 6. Interaction with other components
*   Standard Intent transition.

## 7. General logic of the class
Because standard graphs usually expect one $y$ for each $x$, the app "tricks" the graph by drawing two separate lines (one for the top and one for the bottom) that meet at the sides to form a full circle. It also adds a decorative radius to show a specific angle.

## 8. Simplified explanation
Drawing a circle on a graph is like drawing two smiles: one regular smile for the bottom and one upside-down smile for the top. When they meet perfectly, they look like a circle. The app also draws a red "arm" from the center to the edge to show the radius.

**Analogy:** Like putting two halves of an orange together to make a whole orange.
