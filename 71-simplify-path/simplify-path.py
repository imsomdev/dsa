class Solution:
    def simplifyPath(self, path: str) -> str:
        sp = path.split("/")
        st = []

        for i in sp:
            if i == "" or i == ".":
                continue
            elif i == "..":
                if st:
                    st.pop()
            else:
                st.append(i)

        return "/" + "/".join(st)