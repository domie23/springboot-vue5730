const base = {
    get() {
        return {
            url : "http://localhost:8080/chongwumaorenyang/",
            name: "chongwumaorenyang",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/chongwumaorenyang/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "宠物猫认养系统"
        } 
    }
}
export default base
