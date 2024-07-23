# ENSE-375 Reflection and Refraction Simulator
Shema Dabiri, Conner Williams, Kevin Chi Huang

## Introduction
The Reflection/Refraction simulator will provide the user with an accurate way to simulate how light, and various materials interact with each other in an urban environment. In order to implement the project, we need to identify the different materials used in urban development as well as the different light sources that will be interacting with these materials.
### Navigation 
  * Design Problem
      * 2.1 [2.1 Problem Definition](https://github.com/Sha3-git/ENSE-375/blob/main/REPORT.md#21-problem-definition)
      * 2.2 [2.2 Design Requirements](https://github.com/Sha3-git/ENSE-375/blob/main/REPORT.md#22-design-requirements)
        * 2.2.1 [2.2.1 Functions](https://github.com/Sha3-git/ENSE-375/blob/main/REPORT.md#221-functions)
        * 2.2.2 [2.2.2 Objectives](https://github.com/Sha3-git/ENSE-375/blob/main/REPORT.md#222-objectives)
        * 2.2.3 [2.2.3 Constraints](https://github.com/Sha3-git/ENSE-375/blob/main/REPORT.md#223-constraints)
      * 3.1 [3.1 Solution 1](https://github.com/Sha3-git/ENSE-375/blob/main/REPORT.md#31-Solution-1)
      * 3.2 [3.2 Solution 2](https://github.com/Sha3-git/ENSE-375/blob/main/REPORT.md#32-Solution-2)
      * 3.3 [3.2 Solution 2](https://github.com/Sha3-git/ENSE-375/blob/main/REPORT.md#33-Final-Solution)
        * 3.3.1 [3.3.1 Components]()
        * 3.3.2 [3.3.2 Features]()
        * 3.3.3 [ 3.3.3 Environmental, Societal, Safety, and Economic Considerations]()
        * 3.3.4 [3.3.4	Test Cases and results]()
        * 3.3.5 [ 3.3.5 Limitations]()
      * 4.1 [4.1 Meeting 1](https://github.com/Sha3-git/ENSE-375/blob/main/REPORT.md#41-Meeting-1)


## 2.1 Problem Definition
Design a light reflection and refraction simulator that approximately reproduces light behaviour on urban planning materials as a plausible means of mitigating issues such as light pollution and damage within communities

## 2.2 Design Requirements
 ### 2.2.1 Functions
 The refraction and reflection simulator aims to replicate the behaviour of common sources of light--both natural and artificial when interacting with common urban construction materials. It will show the light travel paths based on the angle of incidence of the ray--whether it will be reflected or refracted, and the reflective properties of the incident material. Our simulator will manufacture these interactions in an experimentally constant environment similar to that of urban communities in the summer. Light sources that will be considered will be lasers, sunlight and incandescent bulbs which are often seen in this setting. Materials considered are water, glass, and steel, which are the major reflective materials utilized in urban infrastructure.
 ### 2.2.2 Objectives
 The objective of our project is to accurately model the behavior of light with various urban materials via physics principles.
 Our simulator attempts to identify and mitigate potential issues related to light's interaction with the reflective materials commonly found in cities and neightbourhoods, such as light polluition, over heating, fire hazards and so on. By understanding how light interacts with different materials, users can  
 develop strategies to mitigate the aforementioned risks.
 Finally, the simulator should be designed with the user in mind. Users need to be able to manipulate variables with ease, such as the angle of incidence and the type of material, allowing for a more interactive experience. This ensures that anyone can effectively use the simulator to achieve their goals.
 ### 2.2.3 Constraints
 **Economic Factors** <br /> 
 **Cost-efficiency:** The simulation will allow users to determine what materials will be more effective at reducing light pollution. Shielding light will impact the energy and money that can be saved. <br /> 
 **Maintenance Costs:** After the software is delivered there will be costs for technical support and bug fixes. <br /> <br />
 **Reliability** <br /> 
 **Accuracy:** Reflection and refraction physics formulas will also be utilized to ensure calculations will be consistent and accurate. <br />
 **Testing:**  Various testing techniques will also be utilized to ensure the system is reliable and able to run at a high standard with no performance issues. <br /> <br />
 **Sustainability and Environmental Factors** <br />
 **Energy Efficiency:** Building with environmentally friendly materials will save more energy and in turn reduce the overall carbon footprint. <br />
 **Resource management:** Efficient code will be written to minimize resource use. <br /> <br />
 **Ethics** <br />
 **Compliance:**  The software will follow regulatory and industry standards. <br />
 **Integrity:** The results and data of the simulation will be presented open and honestly. <br /> <br />
 **Societal Impacts** <br />
 **Health:** Can enhance living conditions in urban environments by choosing to build with more effective materials. <br />
 **Education:** Users are able to learn and experiment with how light interacts with different materials.

## 3.1 Solution 1
Our first iteration of the reflection and refraction simulator will focus on a single light source and material. Utilizing Snell's law for output calculations, users will be able to explore various angles and observe how the light source interacts with the material in terms of reflection and refraction.
However, this iteration will lack some desired features, such as the ability to choose from a variety of light sources and materials. It will be challenging to satisfy the economic and environmental factors, as well as the societal impacts, if the simulator is limited to only one light source and material.

## 3.2 Solution 2
Our second solution increases the scope of consideration further for light behaviour. By including the divergence and dispersion properties of light we will be able to better display the environmental Interactions of light in urban environments. This allows our light reflection and refraction simulator to better emulate light behaviour in urban environments.

## 3.3 Final Solution 
### 3.3.1 Components
Unlike our prior solutions our new solution better encompasses light behaviour in a way that is most impactful on urban development and environments. We covered the reflection and refraction behaviour of light, to show the reflectivity of various materials--however instead of predetermined materials we permitted the user to input their own values so that they would have greater freedom in calculating more extremes for worst case scenario planning. Additionally, We included heat absorbtion from sunlight to determine what materials would absorb the most heat versus materials that would reflect light and remain cooler. We deemed this to be important for consideration so that surfaces in public places would remain relatively cool in sunlight and not burn individuals in hot weather. Lastly, we considered light intensity to quantify how bright various light sources are to see how well they light up areas or if they contribute too much to light polluiton and so on.
![image](https://github.com/user-attachments/assets/3de9f746-2adf-4422-9e60-06271d6ce2d8)

### 3.3.2 Features
| Features               | Usefulness                                                                                         |
| ---------------------- | -------------------------------------------------------------------------------------------------- |
| Reflection Calculation | optics, natural phenomena                                                                          |
| Albedo                 | climatology and environmental science                                                              |
| Intensity              | lighting design and efficiency, illumination                                                       |
| Result interpretation  | interpretations are provided to help the user understand the real world context of the calculation |

### 3.3.3 Environmental, Societal, Safety, and Economic Considerations
**Energy Efficiency:** 
* our application can guide the user to optimize lighting methods which can lessen costs and impacts on the environment due to energy conservation
**Accessibility and Education**
* Simplifies the conmplex scientific concepts needed to make the calculations so that a broader audience can understand it
**Economic considerations**
* Businesses can now better plan their construction projects with foresight into their lighting methods and how they might impact people and the environment. Errors can be caught in planning which will lessen the costs of fixes that may need to be made.
**Reliability and Safety**
*our application features accurate calculations with clear instructions and Feedback forthe user. Through the use of intensive testing we have also ensured it's sfety andf reliability
  
### 3.3.4	Test Cases and results
Test Cases and results
Path Testing: We executed test cases to follow each possible path in the Snell and Intensity Classes, ensuring all paths were covered.
Data Flow: We focused on testing the flow of data within the Snell Class to ensure variables and functions were utilized correctly and efficiently.
Boundary Value Testing: We created test cases with boundary values and tested the edge cases for both the Snell and Albedo Classes. The results were analyzed to ensure that boundary conditions were handled correctly.
Equivalence Class Testing: We divided input data into equivalence class partitions to ensure that test cases for each scenario were covered and verified that the Snell Class handled each partition correctly.
Decision Table Based Testing: We utilized a decision table to execute test cases of various combinations of inputs and conditions, ensuring that all decision rules were evaluated, and the prototype responded accurately. 
Randomized Testing: We executed tests with a range of randomly generated inputs for the Albedo Class and then analyzed the results to detect any unexpected behavior.

### 3.3.5 Limitations
Limitations
Time: We wanted to implement an option for unit conversion with our simulator to provide a more accurate representation of our data to our users but unfortunately ran out of time.
Skill: We are not experts in physics so our formulas could potentially have errors. We went with a simplified model that may also lack detail compared to what someone with experience could offer.
Error Handling: The system might not robustly handle all types of input errors such as null inputs which could lead to potential inaccuracies.
User-friendly: We tried to implement an intuitive graphical user interface to make our simulator more user-friendly. However, we prioritized refining our current functions through more robust testing instead. 

## 4.1 Meeting 1
Time: May 31, 2024. 4:00-4:30pm
Agenda: Distribution of Project Tasks
|Team Member   | Previous Task | Completion State | Next Task |
| -------- | ------- | -------- | ------- |
| Conner  |   Section 2.2.3 Constraints writeup | Completed | Solution 1 brainstorm
| Shema | Section 2.2.1 Functions and 2.2.2 Objectives editing   | Completed | Solution 2 brainstorm
| Kevin    | Section 2.2.2 Objectives writeup   | Completed | Solution documentation
