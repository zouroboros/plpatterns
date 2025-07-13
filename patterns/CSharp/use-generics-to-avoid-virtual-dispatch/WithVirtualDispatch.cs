public static class WithVirtualDispatch 
{
    public static void UseMyInterface(IMyInterface myInterfaceInstance) 
    {
        myInterfaceInstance.InterfaceMethod1();
        myInterfaceInstance.InterfaceMethod2();
        myInterfaceInstance.InterfaceMethod3();
    }
}