class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next = None
        self.prev = None

class DLL:
    def __init__(self):
        self.head = Node(0,0)
        self.tail = Node(0,0)
        self.head.next = self.tail
        self.tail.prev = self.head

    def add(self, node):
        node.next = self.head.next
        node.next.prev = node
        self.head.next = node
        node.prev = self.head

    def remove(self, node):
        node.prev.next = node.next
        node.next.prev = node.prev

    def removeLRU(self):
        nodeToRemove = self.tail.prev
        self.remove(nodeToRemove)
        return nodeToRemove.key

class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.keyMap = {}
        self.dll = DLL()

    def get(self, key: int) -> int:
        if key not in self.keyMap:
            return -1
        node = self.keyMap[key]
        self.dll.remove(node)
        self.dll.add(node)
        return node.value

    def put(self, key: int, value: int) -> None:
        if key not in self.keyMap:
            if len(self.keyMap) == self.capacity:
                del self.keyMap[self.dll.removeLRU()]
            node = Node(key, value)
            self.dll.add(node)
            self.keyMap[key] = node

        else:
            node = self.keyMap[key]
            node.value = value
            self.dll.remove(node)
            self.dll.add(node)
