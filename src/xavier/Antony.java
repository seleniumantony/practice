package xavier;

public abstract class Antony
{
public abstract void start();
public void stop()
{
	System.out.println("pick up started");
}} 
class mary extends Antony
{
	public void start()
{
		System.out.println("Matha car started from veilankanni");
}} 
class joseph extends Antony
{
	public void start()
{
		System.out.println("Joseph festival started");
}} 
