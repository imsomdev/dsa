function canBeEqual(target: number[], arr: number[]): boolean {
    if (target.length !== arr.length) {
        return false;
    }

    const hashMap = new Map<number, number>();

    for (let num of target) {
        hashMap.set(num, (hashMap.get(num) || 0) + 1);
    }

    for (let num of arr) {
        if (!hashMap.has(num)) {
            return false;
        }
        hashMap.set(num, hashMap.get(num)! - 1);
        if (hashMap.get(num) === 0) {
            hashMap.delete(num);
        }
    }

    return hashMap.size === 0;
}
