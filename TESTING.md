# Testing implementations

## Boundary value testing
Our Light Simulator is a calculation reliant application which necessitated a particular focus on our implementation of boundary value analysis. Because the user is allowed to input a range of values in our application, we needed to ensure that all possible invalid inputs were considered and dealt with. Hence, we utilized robust boundary value analysis to ensure nominal values would be calculated correctly and invalid values--caught and dealt with appropriately. Ideally, we would have implemented the worst case analysis implementation but this was not a feasible method nor necessary, due to the variety of testing methods used to ensure the quality of our applicaion. 

![image](https://github.com/user-attachments/assets/5d22d011-d8c8-41dc-bb30-2876c36fea5b)

## Equivalence Class Testing
Similar to boundary value analysis our ECT utilized extreme vales to check the limits of the user input. We partitioned this testing method based on the calculated options of theta1, theta2, index1, and index2. Our use of broad partitioning was because of the repetitiveness of the calculations for each senll's calculation parameter. One ECT class for our Snell's law was functionally equivalent to the rest.

T1: Theta 1 degree between 0-90

T2: Theta 2 degree between 0-90

I1: Index 1 index between 1-4

I2: Index 2 index between 1-4

For testCalculateIndex1, we tested a range of angles and refractive indices to evaluate how our written function would handle different combinations of these values. 
| Case # | T1 Range   | T2 Range    | I2 Range  | Snell Arguments       | Expected Result |
|--------|------------|-------------|-----------|-----------------------|-----------------|
| 1      | (-∞, 0]    | (-∞, 0]     | (-∞, 1]   | Snell(-1, -1, 0, -1)  | -1              |
| 2      | (-∞, 0]    | [T2]        | (-∞, 1]   | Snell(-1, 45, 0, -1)  | -1              |
| 3      | (-∞, 0]    | [91, ∞)     | (-∞, 1]   | Snell(-1, 91, 0, -1)  | -1              |
| 4      | [T1]       | (-∞, 0]     | (-∞, 1]   | Snell(45, -1, 0, -1)  | -1              |
| 5      | [T1]       | [T2]        | (-∞, 1]   | Snell(45, 45, 0, -1)  | -1              |
| 6      | [T1]       | [91, ∞)     | (-∞, 1]   | Snell(45, 91, 0, -1)  | -1              |
| 7      | [91, ∞)    | (-∞, 0]     | (-∞, 1]   | Snell(91, -1, 0, -1)  | -1              |
| 8      | [91, ∞)    | [T2]        | (-∞, 1]   | Snell(91, 45, 0, -1)  | -1              |
| 9      | [91, ∞)    | [91, ∞)     | (-∞, 1]   | Snell(91, 91, 0, -1)  | -1              |
| 10     | (-∞, 0]    | (-∞, 0]     | [I2]      | Snell(-1, -1, 0, 2)   | -1              |
| 11     | (-∞, 0]    | [T2]        | [I2]      | Snell(-1, 45, 0, 2)   | -1              |
| 12     | (-∞, 0]    | [91, ∞)     | [I2]      | Snell(-1, 91, 0, 2)   | -1              |
| 13     | [T1]       | (-∞, 0]     | [I2]      | Snell(45, -1, 0, 2)   | -1              |
| 14     | [T1]       | [T2]        | [I2]      | Snell(45, 45, 0, 2)   | 2               |
| 15     | [T1]       | [91, ∞)     | [I2]      | Snell(45, 91, 0, 2)   | -1              |
| 16     | [91, ∞)    | (-∞, 0]     | [I2]      | Snell(91, -1, 0, 2)   | -1              |
| 17     | [91, ∞)    | [T2]        | [I2]      | Snell(91, 45, 0, 2)   | -1              |
| 18     | [91, ∞)    | [91, ∞)     | [I2]      | Snell(91, 91, 0, 2)   | -1              |
| 19     | (-∞, 0]    | (-∞, 0]     | [4.1, ∞)  | Snell(-1, -1, 0, 4.1) | -1              |
| 20     | (-∞, 0]    | [T2]        | [4.1, ∞)  | Snell(-1, 45, 0, 4.1) | -1              |
| 21     | (-∞, 0]    | [91, ∞)     | [4.1, ∞)  | Snell(-1, 91, 0, 4.1) | -1              |
| 22     | [T1]       | (-∞, 0]     | [4.1, ∞)  | Snell(-1, -1, 0, 4.1) | -1              |
| 23     | [T1]       | [T2]        | [4.1, ∞)  | Snell(45, 45, 0, 4.1) | -1              |
| 24     | [T1]       | [91, ∞)     | [4.1, ∞)  | Snell(45, 91, 0, 4.1) | -1              |
| 25     | [91, ∞)    | (-∞, 0]     | [4.1, ∞)  | Snell(91, -1, 0, 4.1) | -1              |
| 26     | [91, ∞)    | [T2]        | [4.1, ∞)  | Snell(91, 45, 0, 4.1) | -1              |
| 27     | [91, ∞)    | [91, ∞)     | [4.1, ∞)  | Snell(91, 91, 0, 4.1) | -1              |

## Path and Data flow testing 
![image](https://github.com/user-attachments/assets/fd9bf6e5-5540-4c2f-95d1-412d521e346b)
For our data flow coverage we used def-use coverage which covered the lightsimulator main function of our program that made calls to the calculation classes for snell's law, albedo, and light dispersion.
With regards to our path testing we utilized node coverager to ensure all paths were covered at least once. We avoided outer coverage criterias because of the complexity it would have introduced with the our program's loop conditions and we felt that our scope was small enough that node coverage would have been enough to achieve a thorough enough testing of our program

![image](https://github.com/user-attachments/assets/f270d676-a159-4f58-8824-d7fe60e5e5b8)
The Image above features what path testing would have looked like for the entirety of our program.
Within our code we, simply focused on testing the paths for snell's law calculations.

## Desicion Tables


## Use case Testing

## State Transition Testing



