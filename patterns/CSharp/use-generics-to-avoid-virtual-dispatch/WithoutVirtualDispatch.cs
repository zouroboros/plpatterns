public static class WithoutVirtualDispatch 
{
    public static void UseMyInterface<TInstance>(TInstance myInterfaceInstance) where TInstance : IMyInterface 
    {
        myInterfaceInstance.InterfaceMethod1();
        myInterfaceInstance.InterfaceMethod2();
        myInterfaceInstance.InterfaceMethod3();
    }
}