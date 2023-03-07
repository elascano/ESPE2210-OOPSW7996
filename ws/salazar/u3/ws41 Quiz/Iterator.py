class Iterator:
    def __init__(self, items):
        self.items = items
        self.index = 0

    def has_next(self):
        return self.index < len(self.items)

    def next(self):
        item = self.items[self.index]
        self.index += 1
        return item

class Collection:
    def __init__(self, items):
        self.items = items

    def create_iterator(self):
        return Iterator(self.items)

collection = Collection([1, 2, 3, 4, 5])
iterator = collection.create_iterator()

while iterator.has_next():
    item = iterator.next()
    print(item)
