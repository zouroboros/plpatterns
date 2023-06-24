export function* breadthFirst(tree) {
    const queue = [tree]

    while (queue.length > 0) {
        const currentNode = queue.shift()
        yield currentNode.value
        if ("children" in currentNode) {
            queue.push(...currentNode.children)
        }
    }
}