public class MatrixMultiply
{
public static void main(String[] args) throus Exception
{
if (args.length !=2)
{
System.err.println(usage:MatrixMulyiply <in_dir><out_dir);
syestem.exit(2);
}
configuration conf = new configuration();
conf.set("m", "1000");
conf.set("n", "100");
conf.set("p","1000");
@suooressWarning("deprection");
Job job = new Job(conf, "MatrixMultiply");
job.setJarByClass(MatrixMultiply.Class);
job.setOutputKeyClass(Text.Class);
job.setOutputValueClass(Text.Class);


job.setMapperClass(Map.Class);
job.setReducerClass(Reduce.Class);


job.setInputFormateClass(TextInputFormat.Class);
job.setOutputFormateClass(TextOutputFormat.Class);

FileInputFormat.addInputPath(job,new Path(args[0]));
FileOutputFormat.setOutputPath(job,new Path(args[1]));

job.waitForCompletion(true);
}
}




