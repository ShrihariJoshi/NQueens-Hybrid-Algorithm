import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv("nqueens_timing.csv")
plt.plot(data["N"], data["Time(ms)"], marker='o', color='blue')
plt.title("N-Queens Solver Execution Time")
plt.xlabel("Board Size (N)")
plt.ylabel("Time (ms)")
plt.grid(True)
plt.tight_layout()
plt.show()