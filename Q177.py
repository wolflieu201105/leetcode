import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    if (N < 1) :
        return pd.DataFrame({f"getNthHighestSalary({N})": [None]})
    uniqueSalary = employee['salary'].drop_duplicates()
    if N > len(uniqueSalary):
        return pd.DataFrame({f"getNthHighestSalary({N})": [None]})
    sortedSalary = uniqueSalary.sort_values(ascending = False)
    nth_highest = sortedSalary.iloc[N-1]
    return pd.DataFrame({f"getNthHighestSalary({N})": [nth_highest]})
