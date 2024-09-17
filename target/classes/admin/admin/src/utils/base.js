const base = {
    get() {
        return {
            url : "http://localhost:8080/liulangcongwuguanli/",
            name: "liulangcongwuguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/liulangcongwuguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "流浪宠物管理系统"
        } 
    }
}
export default base
