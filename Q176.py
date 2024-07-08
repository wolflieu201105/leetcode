import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    uniqueSalary = employee['salary'].drop_duplicates()
    if 2 > len(uniqueSalary):
        return pd.DataFrame({"SecondHighestSalary": [None]})
    sortedSalary = uniqueSalary.sort_values(ascending = False)
    nth_highest = sortedSalary.iloc[1]
    return pd.DataFrame({"SecondHighestSalary": [nth_highest]})