# SinusCosinus Class Description

## 1. General information
*   **Class Name:** `SinusCosinus`
*   **Type:** Activity
*   **Purpose:** This class displays trigonometric functions: Sine, Cosine, and a phase-shifted Sine. It shows how these waves relate to each other.
*   **Interaction:** Launched from `MainActivity`. Uses `GraphView` with multiple series.

## 2. Variables (class fields)
| Name | Type | Purpose | Where is it used |
| :--- | :--- | :--- | :--- |
| `amp` | `int` | Amplitude (height of the wave) | `onCreate` |
| `numPoints` | `int` | Resolution (number of points for 720 degrees) | `onCreate` |
| `graphSiCo` | `GraphView` | The plot container | `onCreate` |
| `y` | `double` | Calculated Y value | `onCreate` |
| `f` | `double` | Phase shift constant ($\pi/4$) | `onCreate` |
| `series1`, `series2`, `series3` | `LineGraphSeries` | Different lines for Sin, Cos, and Shifted Sin | `onCreate` |

## 3. Classroom Methods

### Method name: `onCreate`
*   **Type:** `protected`
*   **Return value:** `void`
*   **Parameters:** `Bundle savedInstanceState`
*   **What does the method do:**
    1.  Sets up the UI.
    2.  Calculates and fills `series1` (Sine) in Black.
    3.  Calculates and fills `series3` (Sine + Phase shift) in Red.
    4.  Calculates and fills `series2` (Cosine) in Magenta.
    5.  Adds all series to the graph.
*   **When called:** When activity starts.
*   **Important to understand:** The loop goes from 0 to 720, representing degrees. The formula `i * Math.PI / 180` converts degrees to radians, which is required by `Math.sin()`.

## 4. Lifecycle
*   **`onCreate()`:** All drawing logic happens here immediately.

## 5. Interface Interaction (UI)
*   Displays the graph directly without user input in this specific class (hardcoded parameters).

## 6. Interaction with other components
*   Standard Activity transition from `MainActivity`.

## 7. General logic of the class
It pre-calculates three different waves and overlays them on a single coordinate system to show their differences (phase and shape).

## 8. Simplified explanation
Imagine three dancers moving in waves. One starts at zero (Sine), one starts at the top (Cosine), and one starts slightly earlier (Shifted Sine). This class draws the paths of all three dancers at once so you can compare them.
