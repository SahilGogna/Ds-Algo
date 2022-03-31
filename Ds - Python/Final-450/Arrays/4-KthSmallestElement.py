class MinPriorityQueue:
    def __init__(self):
        self.queue = []

    def __str__(self):
        return ' '.join([str(i) for i in self.queue])

    def isEmpty(self):
        return len(self.queue) == 0

    def insert(self, data):
        self.queue.append(data)

    def delVal(self):
        maxE = 0
        for i in range(len(self.queue)):
            if self.queue[i] > self.queue[maxE]:
                maxE = i
        item = self.queue[maxE]
        del self.queue[maxE]
        return item


arr = [int(x) for x in input().split()]
k = int(input())
pq = MinPriorityQueue()
for element in arr:
    pq.insert(element)
    if len(pq.queue) > k:
        pq.delVal()

print(k, "th smallest value is", pq.delVal())
